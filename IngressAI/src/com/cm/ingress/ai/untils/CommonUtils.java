
package com.cm.ingress.ai.untils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.util.Log;

import com.cm.ingress.ai.R;

public class CommonUtils {
    public static String KEY_COPY_DB = "has_copied_db_to_data";
    public static String DB_PATH_DATA;
    private static Context sContext;

    private static final int BUFFER_SIZE = 4000000;
    public static final String DB_NAME = "area_v5.db"; // 保存的数据库文件名
    public static final String PACKAGE_NAME = "com.cm.ingress.ai";
    public static final String DB_PATH = "/data"
            + Environment.getDataDirectory().getAbsolutePath() + "/"
            + PACKAGE_NAME + "/";

    public static void init(Context context) {
        sContext = context;
        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(sContext);
        sharedPrefs.edit().apply();
        copyDB2Deivce();
    }

    public static void copyDB2Deivce() {
        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(sContext);
        if (!sharedPrefs.getBoolean(KEY_COPY_DB, false)) {
            try {
                InputStream is = sContext.getResources().openRawResource(
                        R.raw.area_v5); //欲导入的数据库
                FileOutputStream fos = new FileOutputStream(DB_PATH + DB_NAME);
                byte[] buffer = new byte[BUFFER_SIZE];
                int count = 0;
                while ((count = is.read(buffer)) > 0) {
                    fos.write(buffer, 0, count);
                }
                fos.flush();
                fos.close();
                is.close();
                Editor editor = sharedPrefs.edit();
                editor.putBoolean(KEY_COPY_DB, true);
                editor.commit();
            } catch (FileNotFoundException e) {
                Log.e("Debug", "File not found");
                e.printStackTrace();
            } catch (IOException e) {
                Log.e("Debug", "IO exception");
                e.printStackTrace();
            }
        }
    }
}
