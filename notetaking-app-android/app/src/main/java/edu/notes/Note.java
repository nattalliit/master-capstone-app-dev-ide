package edu.notes;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "notetaking-app")
public class Note {
    @PrimaryKey
    public int id;

    @ColumnInfo(name = "content")
    public String content;
}
