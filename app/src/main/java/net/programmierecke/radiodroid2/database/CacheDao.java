package net.programmierecke.radiodroid2.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

@Dao
public interface CacheDao {
    @Query("SELECT * FROM network_cache WHERE url = :url LIMIT 1")
    CacheEntry getEntry(String url);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertEntry(CacheEntry entry);

    @Query("DELETE FROM network_cache WHERE url = :url")
    void deleteEntry(String url);
}package net.programmierecke.radiodroid2.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

@Dao
public interface CacheDao {
    @Query("SELECT * FROM network_cache WHERE url = :url LIMIT 1")
    CacheEntry getEntry(String url);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertEntry(CacheEntry entry);

    @Query("DELETE FROM network_cache WHERE url = :url")
    void deleteEntry(String url);
}