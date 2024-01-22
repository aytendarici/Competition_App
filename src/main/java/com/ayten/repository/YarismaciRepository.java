package com.ayten.repository;

import com.ayten.entity.Yarismaci;

public class YarismaciRepository  extends  RepositoryManager<Yarismaci,Long>{
    public YarismaciRepository() {
        super(new Yarismaci());
    }
}