package com.nonexistentware.igorsinchuk.pocketmemo.database;

import android.provider.BaseColumns;

/**
 * Created by igor on 3/15/18.
 */

public class TaskContract {
    public static final String DB_NAME = "com.nonexistentware.igorsinchuk.pocketmemo.database";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "task";

        public static final String COL_TASK_TITLE = "title";
    }
}
