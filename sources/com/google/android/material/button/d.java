package com.google.android.material.button;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(29)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes7.dex */
public final class d implements InspectionCompanion {

    /* renamed from: a, reason: collision with root package name */
    public boolean f30847a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f30848b;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void readProperties(@NonNull MaterialButton materialButton, @NonNull PropertyReader propertyReader) {
        if (!this.f30847a) {
            throw c.a();
        }
        propertyReader.readInt(this.f30848b, materialButton.getIconPadding());
    }

    public void mapProperties(@NonNull PropertyMapper propertyMapper) {
        int mapInt;
        mapInt = propertyMapper.mapInt("iconPadding", R.attr.iconPadding);
        this.f30848b = mapInt;
        this.f30847a = true;
    }
}
