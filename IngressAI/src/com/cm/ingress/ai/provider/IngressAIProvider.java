package com.cm.ingress.ai.provider;

import java.util.HashMap;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

public class IngressAIProvider extends ContentProvider {
    private static final String TAG = "IngressAIProvider";
    
    /**
     * The database that the provider uses as its underlying data store
     */
    private static final String DATABASE_NAME = "area_v5.db";
    
    /**
     * The database version
     */
    private static final int DATABASE_VERSION = 1;
    
    /**
     * A projection map used to select columns from the database
     */
    private static HashMap<String, String> sIngressAIProjectionMap;
    
    private static final String[] READ_EDGE_PROJECTION = new String[] {
            Ingress.EDGE._ID,
            Ingress.EDGE.COLUMN_NAME_orig_latE6,
            Ingress.EDGE.COLUMN_NAME_orig_lngE6,
            Ingress.EDGE.COLUMN_NAME_dest_latE6,
            Ingress.EDGE.COLUMN_NAME_dest_lngE6
    };
    
    // The incoming URI matches the Notes URI pattern
    private static final int EDGE = 1;

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String getType(Uri uri) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Uri insert(Uri uri, ContentValues values) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean onCreate() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs,
            String sortOrder) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        // TODO Auto-generated method stub
        return 0;
    }

}
