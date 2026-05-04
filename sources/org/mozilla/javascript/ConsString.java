package org.mozilla.javascript;

import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class ConsString implements CharSequence, Serializable {
    private static final long serialVersionUID = -8432806714471372570L;
    private int depth;
    private final int length;

    /* renamed from: s1, reason: collision with root package name */
    private CharSequence f78357s1;

    /* renamed from: s2, reason: collision with root package name */
    private CharSequence f78358s2;

    public ConsString(CharSequence charSequence, CharSequence charSequence2) {
        this.f78357s1 = charSequence;
        this.f78358s2 = charSequence2;
        this.length = charSequence.length() + charSequence2.length();
        this.depth = 1;
        if (charSequence instanceof ConsString) {
            this.depth = 1 + ((ConsString) charSequence).depth;
        }
        if (charSequence2 instanceof ConsString) {
            this.depth += ((ConsString) charSequence2).depth;
        }
        if (this.depth > 2000) {
            flatten();
        }
    }

    private static void appendFragment(CharSequence charSequence, StringBuilder sb2) {
        if (charSequence instanceof ConsString) {
            ((ConsString) charSequence).appendTo(sb2);
        } else {
            sb2.append(charSequence);
        }
    }

    private synchronized void appendTo(StringBuilder sb2) {
        appendFragment(this.f78357s1, sb2);
        appendFragment(this.f78358s2, sb2);
    }

    private synchronized String flatten() {
        try {
            if (this.depth > 0) {
                StringBuilder sb2 = new StringBuilder(this.length);
                appendTo(sb2);
                this.f78357s1 = sb2.toString();
                this.f78358s2 = "";
                this.depth = 0;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (String) this.f78357s1;
    }

    private Object writeReplace() {
        return toString();
    }

    @Override // java.lang.CharSequence
    public char charAt(int i11) {
        return (this.depth == 0 ? (String) this.f78357s1 : flatten()).charAt(i11);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.length;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i11, int i12) {
        return (this.depth == 0 ? (String) this.f78357s1 : flatten()).substring(i11, i12);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.depth == 0 ? (String) this.f78357s1 : flatten();
    }
}
