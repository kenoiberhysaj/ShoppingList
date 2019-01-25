package com.apress.gerber.shoppinglist;

import android.provider.BaseColumns;

class ShoppingContract {

    private ShoppingContract() {
    }

    static final class ShoppingEntry implements BaseColumns {
        static final String TABLE_NAME = "shopList";
        static final String COLUMN_NAME = "name";
        static final String COLUMN_AMOUNT = "amount";
        static final String COLUMN_TIMESTAMP = "timestamp";
    }
}
