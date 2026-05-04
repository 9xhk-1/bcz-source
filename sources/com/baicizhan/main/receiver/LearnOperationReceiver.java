package com.baicizhan.main.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.baicizhan.client.business.managers.LearnRecordManager;
import q9.x;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class LearnOperationReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f24790a = "LearnOperationReceiver";

    /* renamed from: b, reason: collision with root package name */
    public static final String f24791b = "kill";

    /* renamed from: c, reason: collision with root package name */
    public static final String f24792c = "cancel_kill";

    /* renamed from: d, reason: collision with root package name */
    public static final String f24793d = "book_id";

    /* renamed from: e, reason: collision with root package name */
    public static final String f24794e = "topic_id";

    public void a(Context context, int bookId, int topicId) {
        LearnRecordManager A = LearnRecordManager.A();
        if (!A.O() || A.z() != bookId) {
            throw new RuntimeException("cancelKill");
        }
        A.l(topicId);
    }

    public void b(Context context, int bookId, int topicId) {
        LearnRecordManager A = LearnRecordManager.A();
        if (A.O() && A.z() == bookId && x.r().s().u() != null) {
            A.U(topicId, 0L, 0);
        } else {
            LearnRecordManager.V(context, bookId, topicId);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        Bundle extras = intent.getExtras();
        int i11 = extras.getInt("book_id");
        int i12 = extras.getInt("topic_id");
        if (f24791b.equals(action)) {
            b(context, i11, i12);
            return;
        }
        if (f24792c.equals(action)) {
            a(context, i11, i12);
            return;
        }
        c.b(f24790a, "Unsupported action " + action, new Object[0]);
    }
}
