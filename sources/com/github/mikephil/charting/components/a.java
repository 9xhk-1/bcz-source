package com.github.mikephil.charting.components;

import android.graphics.DashPathEffect;
import com.github.mikephil.charting.components.Legend;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public String f30234a;

    /* renamed from: b, reason: collision with root package name */
    public Legend.LegendForm f30235b;

    /* renamed from: c, reason: collision with root package name */
    public float f30236c;

    /* renamed from: d, reason: collision with root package name */
    public float f30237d;

    /* renamed from: e, reason: collision with root package name */
    public DashPathEffect f30238e;

    /* renamed from: f, reason: collision with root package name */
    public int f30239f;

    public a() {
        this.f30235b = Legend.LegendForm.DEFAULT;
        this.f30236c = Float.NaN;
        this.f30237d = Float.NaN;
        this.f30238e = null;
        this.f30239f = rm.a.f84248a;
    }

    public a(String str, Legend.LegendForm legendForm, float f11, float f12, DashPathEffect dashPathEffect, int i11) {
        Legend.LegendForm legendForm2 = Legend.LegendForm.DEFAULT;
        this.f30234a = str;
        this.f30235b = legendForm;
        this.f30236c = f11;
        this.f30237d = f12;
        this.f30238e = dashPathEffect;
        this.f30239f = i11;
    }
}
