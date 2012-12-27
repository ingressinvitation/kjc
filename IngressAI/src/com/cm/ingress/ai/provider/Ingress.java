
package com.cm.ingress.ai.provider;

import android.provider.BaseColumns;

public class Ingress {

    public static final String AUTHORITY = "com.cm.ingress.ai.provider.Ingress";

    public static final class EDGE implements BaseColumns {
        /**
         * The table name offered by this provider
         */
        public static final String TABLE_NAME = "edge";

        /*
         * Column definitions
         */
        public static final String COLUMN_NAME_orig_latE6 = "orig_latE6";
        public static final String COLUMN_NAME_orig_lngE6 = "orig_lngE6";
        public static final String COLUMN_NAME_dest_latE6 = "dest_latE6";
        public static final String COLUMN_NAME_dest_lngE6 = "dest_lngE6";
        public static final String COLUMN_NAME_team = "team";

    }

    public static final class REGION implements BaseColumns {
        /**
         * The table name offered by this provider
         */
        public static final String TABLE_NAME = "region";

        /*
         * Column definitions
         */

        public static final String COLUMN_NAME_a_latE6 = "a_latE6";
        public static final String COLUMN_NAME_a_lngE6 = "a_lngE6";
        public static final String COLUMN_NAME_b_latE6 = "b_latE6";
        public static final String COLUMN_NAME_b_lngE6 = "b_lngE6";
        public static final String COLUMN_NAME_c_latE6 = "c_latE6";
        public static final String COLUMN_NAME_c_lngE6 = "c_lngE6";
        public static final String COLUMN_NAME_team = "team";

    }
}
