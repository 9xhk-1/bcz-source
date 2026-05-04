package com.mob.commons.a;

import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.utils.SharePrefrenceHelper;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class i extends c {

    /* renamed from: c, reason: collision with root package name */
    private static com.mob.commons.h f40129c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f40130d = com.mob.commons.j.a("014;bh^g6bgbbbdbe$bFbc8hg:bbcbcadd");

    /* renamed from: e, reason: collision with root package name */
    private SharePrefrenceHelper f40131e;

    public i() {
        super(com.mob.commons.j.a("002Tdabc"), 0L, com.mob.commons.j.a("005Udabcddbd:c"), 30L);
        c();
        SharePrefrenceHelper sharePrefrenceHelper = new SharePrefrenceHelper(MobSDK.getContext());
        this.f40131e = sharePrefrenceHelper;
        sharePrefrenceHelper.open(com.mob.commons.j.a("008bYca9cKbbLb8bc[jg"));
    }

    private void n() {
        try {
            HashMap hashMap = (HashMap) this.f40131e.get(f40130d);
            if (hashMap == null || hashMap.isEmpty()) {
                return;
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                long longValue = ((Long) entry.getKey()).longValue();
                Long l11 = (Long) entry.getValue();
                long longValue2 = l11.longValue() - longValue;
                HashMap<String, Object> hashMap2 = new HashMap<>();
                hashMap2.put(com.mob.commons.j.a("005]babiCbTbccb"), l11);
                hashMap2.put(com.mob.commons.j.a("008FbfbabiCbFbcNjg de"), Long.valueOf(longValue2));
                a("BKIOMT", hashMap2);
            }
            this.f40131e.remove(f40130d);
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
    }

    private static synchronized boolean o() {
        synchronized (i.class) {
            if (f40129c != null) {
                return false;
            }
            f40129c = new com.mob.commons.h() { // from class: com.mob.commons.a.i.1

                /* renamed from: a, reason: collision with root package name */
                private volatile long f40132a = 0;

                @Override // com.mob.commons.h
                public void a(boolean z11, boolean z12, long j11) {
                    if (z12) {
                        this.f40132a = System.currentTimeMillis();
                        l.a().a(0L, i.class, new Object[]{-1, new Long[]{0L, Long.valueOf(this.f40132a), Long.valueOf(System.currentTimeMillis())}}, 1);
                    }
                    if (!z11) {
                        if (j11 > 0) {
                            l.a().a(0L, i.class, new Object[]{-1, new Long[]{2L, Long.valueOf(this.f40132a), Long.valueOf(System.currentTimeMillis())}}, 1);
                        }
                    } else {
                        if (z12) {
                            return;
                        }
                        this.f40132a = System.currentTimeMillis();
                        l.a().a(0L, i.class, new Object[]{-1, new Long[]{1L, Long.valueOf(this.f40132a), Long.valueOf(System.currentTimeMillis())}}, 0);
                    }
                }
            };
            com.mob.commons.i.a().a(f40129c);
            return true;
        }
    }

    @Override // com.mob.commons.a.c
    public void a() {
        if (f()) {
            o();
            return;
        }
        Long[] lArr = (Long[]) this.f40115a;
        long longValue = lArr[0].longValue();
        long longValue2 = lArr[1].longValue();
        long longValue3 = (longValue != 3 || lArr.length >= 3) ? lArr[2].longValue() : System.currentTimeMillis();
        if (longValue == 0) {
            n();
            a(longValue2, longValue3);
            b(longValue2);
        } else if (longValue == 1 || longValue == 3) {
            a(longValue2, longValue3);
            b(longValue2);
        } else if (longValue == 2) {
            a(longValue2, longValue3);
            n();
        }
    }

    @Override // com.mob.commons.a.c
    public void b() {
    }

    private void b(long j11) {
        if (com.mob.commons.i.a().b()) {
            return;
        }
        l.a().a(k(), i.class, new Object[]{-1, new Long[]{3L, Long.valueOf(j11)}}, 0);
    }

    private void a(long j11, long j12) {
        try {
            SharePrefrenceHelper sharePrefrenceHelper = this.f40131e;
            String str = f40130d;
            HashMap hashMap = (HashMap) sharePrefrenceHelper.get(str);
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            hashMap.put(Long.valueOf(j11), Long.valueOf(j12));
            this.f40131e.put(str, hashMap);
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
    }
}
