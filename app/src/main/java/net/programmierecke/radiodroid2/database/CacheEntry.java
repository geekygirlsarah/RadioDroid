package net.programmierecke.radiodroid2.database;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "network_cache")
public class CacheEntry {
    @PrimaryKey
    @NonNull
    public String url;
    public String content;
    public long timestamp;

    public CacheEntry(@NonNull String url, String content, long timestamp) {
        this.url = url;
        this.content = content;
        this.timestamp = timestamp;
    }
}package net.programmierecke.radiodroid2.database;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "network_cache")
public class CacheEntry {
    @PrimaryKey
    @NonNull
    public String url;
    public String content;
    public long timestamp;

    public CacheEntry(@NonNull String url, String content, long timestamp) {
        this.url = url;
        this.content = content;
        this.timestamp = timestamp;
    }
}