package com.baicizhan.client.business.util;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class SimpleSpannableBuilder {
    private SpannableStringBuilder builder = new SpannableStringBuilder();

    public SimpleSpannableBuilder append(String text) {
        this.builder.append((CharSequence) text);
        return this;
    }

    public CharSequence build() {
        return this.builder;
    }

    public SimpleSpannableBuilder append(String text, Object... spans) {
        int length = this.builder.length();
        this.builder.append((CharSequence) text);
        int length2 = this.builder.length();
        for (Object obj : spans) {
            this.builder.setSpan(obj, length, length2, 33);
        }
        return this;
    }
}
