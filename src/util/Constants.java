package util;

import java.text.SimpleDateFormat;

public class Constants {

    public static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    // -------------------------------------------------------------------
    //                           CSV filenames
    // -------------------------------------------------------------------

    public static final String CSVNAME_WAREHOUSE = "warehouse.csv";
    public static final String CSVNAME_ORDERLINE = "order_line.csv";
    public static final String CSVNAME_NEWORDER = "new_order.csv";
    public static final String CSVNAME_CUSTOMER = "customer.csv";
    public static final String CSVNAME_DISTRICT = "district.csv";
    public static final String CSVNAME_HISTORY = "history.csv";
    public static final String CSVNAME_STOCK = "stock.csv";
    public static final String CSVNAME_ORDER = "order.csv";
    public static final String CSVNAME_ITEM = "item.csv";

    // -------------------------------------------------------------------
    //                           TPC-C constants
    // -------------------------------------------------------------------

    public final static String[] nameTokens = {"BAR", "OUGHT", "ABLE", "PRI", "PRES", "ESE", "ANTI", "CALLY", "ATION", "EING"};

    public final static int configCommitCount = 100000; // commit every n records
    public final static int configItemCount = 100000; // tpc-c std = 100,000
    public final static int configDistPerWhse = 10; // tpc-c std = 10
    public final static int configCustPerDist = 3000; // tpc-c std = 3,000

    // An invalid item id used to rollback a new order transaction.
    public static final int INVALID_ITEM_ID = -12345;
}
