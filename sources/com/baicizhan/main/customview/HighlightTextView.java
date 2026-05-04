package com.baicizhan.main.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import com.jiongji.andriod.card.R;
import me.grantland.widget.AutofitTextView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class HighlightTextView extends AutofitTextView {

    /* renamed from: b, reason: collision with root package name */
    public int f20052b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f20053c;

    public HighlightTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, R.styleable.HighlightTextView, 0, 0);
        try {
            this.f20052b = obtainStyledAttributes.getColor(0, Color.parseColor("#FF0000"));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public CharSequence getHighlightText() {
        return this.f20053c;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(savedState.getSuperState());
        setHighlightText(savedState.f20054a);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), getHighlightText());
    }

    public void setHighlightText(CharSequence text) {
        this.f20053c = text;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = this.f20053c.length();
        int i11 = -1;
        for (int i12 = 0; i12 < length; i12++) {
            if (this.f20053c.charAt(i12) == '[') {
                i11 = spannableStringBuilder.length();
            } else if (this.f20053c.charAt(i12) == ']') {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f20052b), i11, spannableStringBuilder.length(), 33);
            } else {
                spannableStringBuilder.append(this.f20053c.charAt(i12));
            }
        }
        setText(spannableStringBuilder);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public String f20054a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel source) {
                return new SavedState(source);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int size) {
                return new SavedState[0];
            }
        }

        public SavedState(Parcelable superState, CharSequence highlightText) {
            super(superState);
            this.f20054a = highlightText.toString();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            super.writeToParcel(dest, flags);
            dest.writeString(this.f20054a);
        }

        public SavedState(Parcel source) {
            super(source);
            this.f20054a = source.readString();
        }
    }
}
