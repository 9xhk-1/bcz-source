package com.huawei.hms.support.feature.request;

import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class AbstractAuthParamsHelper {
    protected Set<Scope> signInScopes = new HashSet();
    protected Set<PermissionInfo> permissionSet = new HashSet();

    public AbstractAuthParamsHelper() {
    }

    public AbstractAuthParamsHelper(AbstractAuthParams abstractAuthParams) {
        this.signInScopes.addAll(abstractAuthParams.getRequestScopeList());
        this.permissionSet.addAll(abstractAuthParams.getPermissionInfos());
    }
}
