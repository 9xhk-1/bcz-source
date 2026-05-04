package com.meizu.cloud.pushsdk.platform.b;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes7.dex */
public class a extends c {

    /* renamed from: h, reason: collision with root package name */
    private int[] f39949h;

    /* renamed from: i, reason: collision with root package name */
    private int f39950i;

    /* renamed from: j, reason: collision with root package name */
    private String f39951j;

    public a(Context context, String str, String str2, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService) {
        super(context, str, str2, aVar, scheduledExecutorService);
        this.f39962f = MinSdkChecker.isSupportSetDrawableSmallIcon();
    }

    public void a(int i11) {
        this.f39950i = i11;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    public BasicPushStatus b() {
        return null;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    public Intent c() {
        Intent intent = new Intent();
        intent.putExtra("strategy_package_name", this.f39957a.getPackageName());
        intent.putExtra("strategy_type", g());
        intent.putExtra("strategy_child_type", this.f39950i);
        int i11 = this.f39950i;
        if (i11 == 2) {
            intent.putExtra("strategy_params", this.f39951j);
            return intent;
        }
        if (i11 == 1) {
            return null;
        }
        return intent;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    public Intent[] d() {
        int[] iArr = this.f39949h;
        if (iArr == null) {
            return null;
        }
        Intent[] intentArr = new Intent[iArr.length];
        for (int i11 = 0; i11 < this.f39949h.length; i11++) {
            DebugLogger.i("Strategy", "send notifyId " + this.f39949h[i11] + " to PushManagerService");
            Intent intent = new Intent();
            intent.putExtra("strategy_package_name", this.f39957a.getPackageName());
            intent.putExtra("strategy_type", g());
            intent.putExtra("strategy_child_type", this.f39950i);
            intent.putExtra("strategy_params", "" + this.f39949h[i11]);
            intentArr[i11] = intent;
        }
        return intentArr;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    public BasicPushStatus e() {
        int i11 = this.f39950i;
        if (i11 == 0) {
            if (!MinSdkChecker.isSupportSetDrawableSmallIcon()) {
                DebugLogger.e("Strategy", "android 6.0 blow so cancel all by context");
                com.meizu.cloud.pushsdk.notification.c.b.a(this.f39957a);
            }
            com.meizu.cloud.pushsdk.notification.c.b.a(this.f39957a, this.f39960d);
            return null;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return null;
            }
            com.meizu.cloud.pushsdk.notification.c.b.a(this.f39957a, this.f39960d, this.f39951j);
            return null;
        }
        int[] iArr = this.f39949h;
        if (iArr == null) {
            return null;
        }
        for (int i12 : iArr) {
            DebugLogger.e("Strategy", "clear notifyId " + i12);
            com.meizu.cloud.pushsdk.notification.c.b.a(this.f39957a, this.f39960d, i12);
        }
        return null;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    public BasicPushStatus f() {
        return null;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    public int g() {
        return 64;
    }

    public a(Context context, ScheduledExecutorService scheduledExecutorService, boolean z11) {
        this(context, null, null, null, scheduledExecutorService);
        this.f39963g = z11;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    public void a(BasicPushStatus basicPushStatus) {
    }

    public void a(String str) {
        this.f39951j = str;
    }

    public void a(int... iArr) {
        this.f39949h = iArr;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    public boolean a() {
        int[] iArr;
        int i11 = this.f39950i;
        return i11 == 0 || ((iArr = this.f39949h) != null && iArr.length > 0 && i11 == 1) || (i11 == 2 && !TextUtils.isEmpty(this.f39951j));
    }
}
