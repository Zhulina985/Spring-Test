package org.example;

import org.springframework.context.annotation.ComponentScan;



import org.example.tool.SongList;
import org.example.tool.SongListService;
import org.example.tool.SongListServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {

       ApplicationContext context = new AnnotationConfigApplicationContext(SongListServiceImpl.class);
        SongListService service = context.getBean(SongListService.class);

    }
}