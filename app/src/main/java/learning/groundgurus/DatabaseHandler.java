package learning.groundgurus;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by User on 7/21/2017.
 */

public class DatabaseHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "gg-groundgurus";

    private static final String TABLE_NAME = "users";

    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        try {

            String CREATE_USERS_TABLE = "CREATE TABLE " + TABLE_NAME + "(user_id INTEGER PRIMARY KEY, user_email TEXT UNIQUE, user_name TEXT)";
            db.execSQL(CREATE_USERS_TABLE);

        } catch (SQLiteException err) {

            Log.e("Database Failed: ", err.getMessage());

        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        try {

            db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
            onCreate(db);

        } catch (SQLiteException err) {

            Log.e("Database Failed: ", err.getMessage());

        }

    }

    void insertUser(UserModel userModel) {

        try {

            SQLiteDatabase db = this.getWritableDatabase();
            db.execSQL("INSERT INTO " + TABLE_NAME + "(user_email, user_name) VALUES(?,?)", new String[]{userModel.getUser_email(), userModel.getUser_name()});
            db.close();

        } catch (SQLiteException err)

        {

            Log.e("Database Failed: ", err.getMessage());

        }

    }

    int getTotalUsersCount() {

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_NAME, null);
        return cursor.getCount();

    }

}
