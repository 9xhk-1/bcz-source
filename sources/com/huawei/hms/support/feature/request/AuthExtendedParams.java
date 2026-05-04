package com.huawei.hms.support.feature.request;

import android.os.Bundle;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface AuthExtendedParams {
    public static final int FITNESS = 1;
    public static final int GAMES = 3;

    Bundle getExtendedBundle();

    int getExtendedParamType();

    List<Scope> getExtendedScopes();
}
