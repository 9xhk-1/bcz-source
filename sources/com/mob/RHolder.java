package com.mob;

import com.mob.tools.proguard.PublicMemberKeeper;

@Deprecated
/* loaded from: classes7.dex */
public class RHolder implements PublicMemberKeeper {

    /* renamed from: a, reason: collision with root package name */
    private static RHolder f40047a;

    /* renamed from: b, reason: collision with root package name */
    private int f40048b;

    /* renamed from: c, reason: collision with root package name */
    private int f40049c;

    /* renamed from: d, reason: collision with root package name */
    private int f40050d;

    private RHolder() {
    }

    public static RHolder getInstance() {
        if (f40047a == null) {
            synchronized (RHolder.class) {
                try {
                    if (f40047a == null) {
                        f40047a = new RHolder();
                    }
                } finally {
                }
            }
        }
        return f40047a;
    }

    public int getActivityThemeId() {
        return this.f40048b;
    }

    public int getDialogLayoutId() {
        return this.f40049c;
    }

    public int getDialogThemeId() {
        return this.f40050d;
    }

    public RHolder setActivityThemeId(int i11) {
        this.f40048b = i11;
        return f40047a;
    }

    public RHolder setDialogLayoutId(int i11) {
        this.f40049c = i11;
        return f40047a;
    }

    public RHolder setDialogThemeId(int i11) {
        this.f40050d = i11;
        return f40047a;
    }
}
