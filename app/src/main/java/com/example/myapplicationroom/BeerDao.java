package com.example.myapplicationroom;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

@Dao
public interface BeerDao {
    @Query("SELECT * FROM beer")
    List<Beer> getAllBeers();

    @Insert
    void insertALL(Beer... beers);
}
