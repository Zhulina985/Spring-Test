package org.example.tool;


import com.alibaba.fastjson.JSON;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

@Service
public class SongListServiceImpl implements SongListService{

@Autowired
   private ResourceLoader resourceLoader=new DefaultResourceLoader();

   private Map<String,SongList> songListMap=null;





@PostConstruct
   public void init(){
       try {
           InputStream inputStream = resourceLoader.getResource("classpath:data.json").getInputStream();


           List songListList= JSON.parseArray(IOUtils.toString(inputStream,"utf-8"));
           for (int i = 0; i < songListList.size(); i++) {
               System.out.println(songListList.get(i));
           }

       } catch (IOException e) {
           throw new RuntimeException(e);
       }


   }


    @Override
    public SongList get(String id) {
      return songListMap.get(id);
    }



}
