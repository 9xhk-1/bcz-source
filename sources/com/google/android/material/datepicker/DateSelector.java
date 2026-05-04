package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.core.util.Pair;
import com.google.android.material.internal.m0;
import java.text.SimpleDateFormat;
import java.util.Collection;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public interface DateSelector<S> extends Parcelable {
    static void N0(@NonNull final EditText... editTextArr) {
        if (editTextArr.length == 0) {
            return;
        }
        View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: com.google.android.material.datepicker.f
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                DateSelector.z0(editTextArr, view, z11);
            }
        };
        for (EditText editText : editTextArr) {
            editText.setOnFocusChangeListener(onFocusChangeListener);
        }
        final EditText editText2 = editTextArr[0];
        editText2.postDelayed(new Runnable() { // from class: com.google.android.material.datepicker.g
            @Override // java.lang.Runnable
            public final void run() {
                m0.y(editText2, false);
            }
        }, 100L);
    }

    static /* synthetic */ void z0(EditText[] editTextArr, View view, boolean z11) {
        for (EditText editText : editTextArr) {
            if (editText.hasFocus()) {
                return;
            }
        }
        m0.r(view, false);
    }

    @NonNull
    String A0(@NonNull Context context);

    @NonNull
    String F0(Context context);

    @NonNull
    Collection<Pair<Long, Long>> G0();

    void Z(@NonNull S s11);

    @NonNull
    View c0(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle, @NonNull CalendarConstraints calendarConstraints, @NonNull r<S> rVar);

    void f0(@Nullable SimpleDateFormat simpleDateFormat);

    @Nullable
    String getError();

    boolean h0();

    @NonNull
    Collection<Long> m0();

    @Nullable
    S o0();

    @StringRes
    int q();

    void v0(long j11);

    @StyleRes
    int w(Context context);
}
