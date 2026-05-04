package me.grantland.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import me.grantland.widget.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class AutofitTextView extends AppCompatTextView implements a.c {

    /* renamed from: a, reason: collision with root package name */
    public a f73154a;

    public AutofitTextView(Context context) {
        super(context);
        c(context, null, 0);
    }

    public final void c(Context context, AttributeSet attrs, int defStyle) {
        this.f73154a = a.h(this, attrs, defStyle).c(this);
    }

    public boolean d() {
        return this.f73154a.r();
    }

    public void e(int unit, float size) {
        this.f73154a.z(unit, size);
    }

    public void f(int unit, float minSize) {
        this.f73154a.B(unit, minSize);
    }

    public void g() {
        setSizeToFit(true);
    }

    public a getAutofitHelper() {
        return this.f73154a;
    }

    public float getMaxTextSize() {
        return this.f73154a.m();
    }

    public float getMinTextSize() {
        return this.f73154a.n();
    }

    public float getPrecision() {
        return this.f73154a.o();
    }

    public float getTextSizeWhenMaxLine() {
        return this.f73154a.q();
    }

    public void h(int unit, float size) {
        this.f73154a.K(unit, size);
    }

    @Override // android.widget.TextView
    public void setLines(int lines) {
        super.setLines(lines);
        a aVar = this.f73154a;
        if (aVar != null) {
            aVar.x(lines);
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int maxLines) {
        super.setMaxLines(maxLines);
        a aVar = this.f73154a;
        if (aVar != null) {
            aVar.x(maxLines);
        }
    }

    public void setMaxTextSize(float size) {
        this.f73154a.y(size);
    }

    public void setMinTextSize(int minSize) {
        this.f73154a.B(2, minSize);
    }

    public void setPrecision(float precision) {
        this.f73154a.C(precision);
    }

    public void setSizeToFit(boolean sizeToFit) {
        this.f73154a.v(sizeToFit);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextSize(int unit, float size) {
        super.setTextSize(unit, size);
        a aVar = this.f73154a;
        if (aVar != null) {
            aVar.I(unit, size);
        }
    }

    public void setTextSizeWhenMaxLine(int size) {
        this.f73154a.J(size);
    }

    public AutofitTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        c(context, attrs, 0);
    }

    public AutofitTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        c(context, attrs, defStyle);
    }

    @Override // me.grantland.widget.a.c
    public void b(float textSize, float oldTextSize) {
    }
}
