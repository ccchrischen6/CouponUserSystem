package com.imooc.passbook.constant;

import sun.nio.fs.AbstractFileTypeDetector;

/**
 * <h1>constants definition</h1>
 */
public class Constants {

    /** merchants' coupon Kafka Topic */
    public static final String TEMPLATE_TOPIC = "merchants-template";

    /** the directory of files */
    public static final String TOKEN_DIR = "/tmp/token";

    /** used token suffix */
    public static final String USED_TOKEN_SUFFIX = "_";

    /** Redis key of users */
    public static final String  USE_COUNT_REDIS_KEY = "imooc-user-count";

    /**
     * <h2>User Hbase Table</h2>
     */
    public class UserTable{
        /** The table name for User HBase */
        public static final String TABLE_NAME = "pb:user";

        /** basic info column family*/
        public static final String FAMILY_B = "b";

        public static final String NAME = "name";

        public static final String AGE = "age";

        public static final String SEX = "sex";

        /** extra info column family */
        public static final String FAMILY_O = "o";

        /** phone */
        public static final String PHONE = "phone";

        /** address */
        public static final String ADDRESS = "address";

    }

    /**
     * <h2>PassTemplate HBase Table</h2>
     */
    public class PassTemplateTable {

        /** PassTemplate HBase Table Name */
        public static final String TABLE_NAME = "pb:passtemplate";

        /** basic info column family */
        public static final String FAMILY_B = "b";

        /** merchants' id */
        public static final String ID = "id";

        /** coupon title */
        public static final String TITlE = "title";

        /** coupon summary info */
        public static final String SUMMARY = "summary";

        /** coupon more info */
        public static final String DESC = "desc";

        /** if the coupon has token */
        public static final String HAS_TOKEN = "has_token";

        /** coupon background color */
        public static final String BACKGROUND = "background";

        /** restriction info column family */
        public static final String FAMILY_C = "c";

        /** max limit */
        public static final String LIMIT = "limit";

        /** start of the coupon*/
        public static final String START = "start";

        /** end of the coupon*/
        public static final String END = "end";

    }

    /**
     * <h2>Pass HBase Table</h2>
     * */
    public class PassTable {

        /** Pass HBase Table Name */
        public static final String TABLE_NAME = "pb:pass";

        /** info column family */
        public static final String FAMILY_I = "i";

        /** the id of users*/
        public static final String USER_ID = "user_id";

        /** the id of coupons */
        public static final String TEMPLATE_ID = "template_id";

        /** the token for coupon */
        public static final String TOKEN = "token";

        /** the date it was received */
        public static final String ASSIGN_DATE = "assign_date";

        /** the date it was consumed */
        public static final String CON_DATE = "con_date";

    }

    /**
     * <h2>Feedback HBase column family</h2>
     */
    public class Feedback {

        /** feedback HBase table name */
        public static final String TABLE_NAME = "pb:feedback";

        /** basic info */
        public static final String FAMILY_I = "i";

        /** user id */
        public static final String USER_ID = "user_id";

        /** comments type */
        public static final String TYPE = "type";

        /** PassTemplate RowKey, if it is for app, the value is -1 */
        public static final String TEMPLATE_ID = "template_id";

        /** comment content */
        public static final String COMMENT = "comment";




    }
}
