package com.igexin.base.a;

import android.os.SystemClock;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public final class c implements a {

    /* renamed from: e, reason: collision with root package name */
    public String f37051e;

    /* renamed from: f, reason: collision with root package name */
    public String f37052f;

    /* renamed from: a, reason: collision with root package name */
    final List<String> f37047a = new CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f37048b = 10;

    /* renamed from: c, reason: collision with root package name */
    public long f37049c = 30000;

    /* renamed from: g, reason: collision with root package name */
    private final Pattern f37053g = Pattern.compile("(.+)?[$][{](.+)?[}].+");

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f37054h = new AtomicBoolean(true);

    /* renamed from: d, reason: collision with root package name */
    long f37050d = SystemClock.elapsedRealtime();

    public c() {
        b a11 = b.a();
        if (a11.f37046a.contains(this)) {
            return;
        }
        a11.f37046a.add(this);
    }

    public final String a(String str) {
        try {
            Matcher matcher = this.f37053g.matcher(str);
            return matcher.find() ? str.replaceFirst("[$][{](.+)?[}]", new SimpleDateFormat(matcher.group(2)).format(new Date())) : str;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return str;
        }
    }

    @Override // com.igexin.base.a.a
    public final void enableLog(boolean z11) {
        this.f37054h.set(z11);
    }

    @Override // com.igexin.base.a.a
    public final boolean isEnabled() {
        return this.f37054h.get();
    }

    @Override // com.igexin.base.a.a
    public final void log(String str) {
        if (isEnabled()) {
            this.f37047a.add(str);
        }
    }
}
