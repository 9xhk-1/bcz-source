package ql;

import android.view.View;
import com.flipboard.bottomsheet.BottomSheetLayout;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final float f82369a = 0.7f;

    @Override // ql.d
    public float a(float translation, float maxTranslation, float peekedTranslation, BottomSheetLayout parent, View view) {
        return (translation / maxTranslation) * 0.7f;
    }
}
