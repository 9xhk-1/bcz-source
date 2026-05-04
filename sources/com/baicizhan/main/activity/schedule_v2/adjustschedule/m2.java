package com.baicizhan.main.activity.schedule_v2.adjustschedule;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class m2 extends a {

    /* renamed from: h, reason: collision with root package name */
    public static final int f19156h = 5;

    /* renamed from: i, reason: collision with root package name */
    public static final int f19157i = 10;

    /* renamed from: j, reason: collision with root package name */
    public static final int f19158j = 1000;

    /* renamed from: f, reason: collision with root package name */
    public Map<Integer, Integer> f19159f;

    /* renamed from: g, reason: collision with root package name */
    public Map<Integer, Integer> f19160g;

    public m2(String dayFormat, String wordFormat) {
        super(dayFormat, wordFormat);
        this.f19159f = new HashMap();
        this.f19160g = new HashMap();
    }

    @Override // com.baicizhan.main.activity.schedule_v2.adjustschedule.a
    public void a() {
        this.f19159f.clear();
        this.f19160g.clear();
    }

    @Override // com.baicizhan.main.activity.schedule_v2.adjustschedule.a
    public int d(int wordIdx) {
        Integer num = this.f18991c.get(wordIdx);
        num.intValue();
        Integer num2 = this.f19160g.get(num);
        num2.intValue();
        return this.f18992d.indexOf(num2);
    }

    @Override // com.baicizhan.main.activity.schedule_v2.adjustschedule.a
    public int e(int dayIdx) {
        Integer num = this.f18992d.get(dayIdx);
        num.intValue();
        Integer num2 = this.f19159f.get(num);
        num2.intValue();
        return this.f18991c.indexOf(num2);
    }

    @Override // com.baicizhan.main.activity.schedule_v2.adjustschedule.a
    public int f() {
        return 5;
    }

    @Override // com.baicizhan.main.activity.schedule_v2.adjustschedule.a
    public int g(int currentCount) {
        if (currentCount < 100) {
            return 5;
        }
        if (currentCount < 400) {
            return 25;
        }
        return currentCount < 1000 ? 50 : 100;
    }

    @Override // com.baicizhan.main.activity.schedule_v2.adjustschedule.a
    public void k(int dayCount, int wordCount) {
        this.f19160g.put(Integer.valueOf(wordCount), Integer.valueOf(dayCount));
        if (!this.f19159f.containsKey(Integer.valueOf(dayCount))) {
            this.f19159f.put(Integer.valueOf(dayCount), Integer.valueOf(wordCount));
        } else if (wordCount < this.f19159f.get(Integer.valueOf(dayCount)).intValue()) {
            this.f19159f.put(Integer.valueOf(dayCount), Integer.valueOf(wordCount));
        }
    }

    @Override // com.baicizhan.main.activity.schedule_v2.adjustschedule.a
    public void l(int totalWordCount) {
        int f11 = f();
        if (totalWordCount <= f11) {
            this.f19159f.put(1, Integer.valueOf(totalWordCount));
            this.f19160g.put(Integer.valueOf(totalWordCount), 1);
        } else {
            int min = Math.min(totalWordCount, 1000);
            while (f11 <= min) {
                k((totalWordCount / f11) + (totalWordCount % f11 == 0 ? 0 : 1), f11);
                f11 += g(f11);
            }
            if (!this.f19160g.containsKey(Integer.valueOf(min))) {
                this.f19159f.put(1, Integer.valueOf(min));
                this.f19160g.put(Integer.valueOf(min), 1);
            }
        }
        this.f18991c.addAll(this.f19160g.keySet());
        this.f18992d.addAll(this.f19159f.keySet());
        Collections.sort(this.f18991c);
        Collections.sort(this.f18992d);
    }
}
