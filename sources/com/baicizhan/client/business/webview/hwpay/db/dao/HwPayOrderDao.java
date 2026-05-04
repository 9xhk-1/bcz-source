package com.baicizhan.client.business.webview.hwpay.db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.baicizhan.client.business.webview.hwpay.db.entity.HwPayOrderInfo;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Dao
/* loaded from: classes4.dex */
public interface HwPayOrderDao {
    @Insert(onConflict = 1)
    void addCourseItem(@k HwPayOrderInfo hwPayOrderInfo);

    @Query("DELETE FROM hw_pay_order WHERE product_id = :productId")
    void deleteCourseItem(@k String str);

    @l
    @Query("select * from hw_pay_order where product_id = :productId")
    HwPayOrderInfo getOrderInfo(@k String str);
}
