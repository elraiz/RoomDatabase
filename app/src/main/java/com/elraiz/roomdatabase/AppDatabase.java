package com.elraiz.roomdatabase;

//NIM : 10117163
//Nama : Muhamad El Raiz
//Kelas : IF-5

//1 Mei 2020 Pembuatan AktivisDao,Entity AppDatabase dan MainActivity

import androidx.room.Database;
import androidx.room.RoomDatabase;


@Database(entities = {AktivisEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract AktivisDao aktivisDao();
}
