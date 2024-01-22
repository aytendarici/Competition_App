package com.ayten.repository;

import com.ayten.entity.Unlu;

public class UnluRepository  extends  RepositoryManager<Unlu,Long>{
    public UnluRepository() {
        super(new Unlu());
    }
}