package com.baicizhan.client.business.webview.hwpay.db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.baicizhan.client.business.webview.hwpay.db.entity.HwPayOrderInfo;
import java.util.Collections;
import java.util.List;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class HwPayOrderDao_Impl implements HwPayOrderDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<HwPayOrderInfo> __insertAdapterOfHwPayOrderInfo = new EntityInsertAdapter<HwPayOrderInfo>() { // from class: com.baicizhan.client.business.webview.hwpay.db.dao.HwPayOrderDao_Impl.1
        @Override // androidx.room.EntityInsertAdapter
        @NonNull
        public String createQuery() {
            return "INSERT OR REPLACE INTO `hw_pay_order` (`product_id`,`product_type`,`count`,`sub_item_id`,`extra`) VALUES (?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final HwPayOrderInfo entity) {
            if (entity.getProductId() == null) {
                statement.mo5623bindNull(1);
            } else {
                statement.mo5624bindText(1, entity.getProductId());
            }
            statement.mo5622bindLong(2, entity.getProductType());
            statement.mo5622bindLong(3, entity.getCount());
            statement.mo5622bindLong(4, entity.getSubitemId());
            if (entity.getExtra() == null) {
                statement.mo5623bindNull(5);
            } else {
                statement.mo5624bindText(5, entity.getExtra());
            }
        }
    };

    public HwPayOrderDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
    }

    public static /* synthetic */ HwPayOrderInfo a(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare("select * from hw_pay_order where product_id = ?");
        try {
            if (str == null) {
                prepare.mo5623bindNull(1);
            } else {
                prepare.mo5624bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "product_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "product_type");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "count");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "sub_item_id");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "extra");
            HwPayOrderInfo hwPayOrderInfo = null;
            if (prepare.step()) {
                hwPayOrderInfo = new HwPayOrderInfo(prepare.isNull(columnIndexOrThrow) ? null : prepare.getText(columnIndexOrThrow), (int) prepare.getLong(columnIndexOrThrow2), (int) prepare.getLong(columnIndexOrThrow3), (int) prepare.getLong(columnIndexOrThrow4), prepare.isNull(columnIndexOrThrow5) ? null : prepare.getText(columnIndexOrThrow5));
            }
            prepare.close();
            return hwPayOrderInfo;
        } catch (Throwable th2) {
            prepare.close();
            throw th2;
        }
    }

    public static /* synthetic */ Object c(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare("DELETE FROM hw_pay_order WHERE product_id = ?");
        try {
            if (str == null) {
                prepare.mo5623bindNull(1);
            } else {
                prepare.mo5624bindText(1, str);
            }
            prepare.step();
            prepare.close();
            return null;
        } catch (Throwable th2) {
            prepare.close();
            throw th2;
        }
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$addCourseItem$0(HwPayOrderInfo hwPayOrderInfo, SQLiteConnection sQLiteConnection) {
        this.__insertAdapterOfHwPayOrderInfo.insert(sQLiteConnection, (SQLiteConnection) hwPayOrderInfo);
        return null;
    }

    @Override // com.baicizhan.client.business.webview.hwpay.db.dao.HwPayOrderDao
    public void addCourseItem(final HwPayOrderInfo entity) {
        entity.getClass();
        DBUtil.performBlocking(this.__db, false, true, new l() { // from class: com.baicizhan.client.business.webview.hwpay.db.dao.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object lambda$addCourseItem$0;
                lambda$addCourseItem$0 = HwPayOrderDao_Impl.this.lambda$addCourseItem$0(entity, (SQLiteConnection) obj);
                return lambda$addCourseItem$0;
            }
        });
    }

    @Override // com.baicizhan.client.business.webview.hwpay.db.dao.HwPayOrderDao
    public void deleteCourseItem(final String productId) {
        DBUtil.performBlocking(this.__db, false, true, new l() { // from class: com.baicizhan.client.business.webview.hwpay.db.dao.c
            @Override // x00.l
            public final Object invoke(Object obj) {
                return HwPayOrderDao_Impl.c(productId, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.baicizhan.client.business.webview.hwpay.db.dao.HwPayOrderDao
    public HwPayOrderInfo getOrderInfo(final String productId) {
        return (HwPayOrderInfo) DBUtil.performBlocking(this.__db, true, false, new l() { // from class: com.baicizhan.client.business.webview.hwpay.db.dao.a
            @Override // x00.l
            public final Object invoke(Object obj) {
                return HwPayOrderDao_Impl.a(productId, (SQLiteConnection) obj);
            }
        });
    }
}
