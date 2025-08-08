package org.example.tool;


import org.springframework.stereotype.Service;

@Service
public interface SongListService {


    public SongList get(String id);

}
