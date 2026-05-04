package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f31457d = {R.attr.state_checked};

    /* renamed from: a, reason: collision with root package name */
    public boolean f31458a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f31459b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f31460c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public boolean f31461a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            @NonNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void a(@NonNull Parcel parcel) {
            this.f31461a = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f31461a ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends AccessibilityDelegateCompat {
        public a() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setCheckable(CheckableImageButton.this.a());
            accessibilityNodeInfoCompat.setChecked(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public boolean a() {
        return this.f31459b;
    }

    public boolean b() {
        return this.f31460c;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f31458a;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i11) {
        if (!this.f31458a) {
            return super.onCreateDrawableState(i11);
        }
        int[] iArr = f31457d;
        return View.mergeDrawableStates(super.onCreateDrawableState(i11 + iArr.length), iArr);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setChecked(savedState.f31461a);
    }

    @Override // android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f31461a = this.f31458a;
        return savedState;
    }

    public void setCheckable(boolean z11) {
        if (this.f31459b != z11) {
            this.f31459b = z11;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z11) {
        if (!this.f31459b || this.f31458a == z11) {
            return;
        }
        this.f31458a = z11;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z11) {
        this.f31460c = z11;
    }

    @Override // android.view.View
    public void setPressed(boolean z11) {
        if (this.f31460c) {
            super.setPressed(z11);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f31458a);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f31459b = true;
        this.f31460c = true;
        ViewCompat.setAccessibilityDelegate(this, new a());
    }
}
