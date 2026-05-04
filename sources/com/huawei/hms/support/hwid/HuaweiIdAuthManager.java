package com.huawei.hms.support.hwid;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.hwid.ap;
import com.huawei.hms.hwid.as;
import com.huawei.hms.hwid.x;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.hwid.common.HuaweiIdAuthException;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthExtendedParams;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParams;
import com.huawei.hms.support.hwid.result.AuthHuaweiId;
import com.huawei.hms.support.hwid.result.HuaweiIdAuthResult;
import com.huawei.hms.support.hwid.service.HuaweiIdAuthService;
import com.huawei.hms.support.hwid.service.HuaweiIdAuthServiceImpl;
import fr.k;
import fr.l;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class HuaweiIdAuthManager {
    private static Intent a(Activity activity, List<Scope> list) {
        return getService(activity, x.a(list)).getSignInIntent();
    }

    public static void addAuthScopes(Activity activity, int i11, HuaweiIdAuthExtendedParams huaweiIdAuthExtendedParams) {
        if (huaweiIdAuthExtendedParams == null) {
            throw new NullPointerException("HuaweiIdAuthExtendedParams should not be null");
        }
        addAuthScopes(activity, i11, huaweiIdAuthExtendedParams.getExtendedScopes());
    }

    public static boolean containScopes(AuthHuaweiId authHuaweiId, HuaweiIdAuthExtendedParams huaweiIdAuthExtendedParams) {
        if (huaweiIdAuthExtendedParams == null) {
            return false;
        }
        return containScopes(authHuaweiId, huaweiIdAuthExtendedParams.getExtendedScopes());
    }

    public static AuthHuaweiId getAuthResult() {
        return x.b();
    }

    public static AuthHuaweiId getAuthResultWithScopes(List<Scope> list) throws HuaweiIdAuthException {
        if (ap.a(list).booleanValue()) {
            throw new HuaweiIdAuthException("ScopeList should not be empty");
        }
        AuthHuaweiId b11 = x.b();
        if (b11 == null) {
            b11 = new AuthHuaweiId();
        }
        b11.requestExtraScopes(list);
        return b11;
    }

    public static AuthHuaweiId getExtendedAuthResult(HuaweiIdAuthExtendedParams huaweiIdAuthExtendedParams) {
        if (huaweiIdAuthExtendedParams == null) {
            throw new NullPointerException("HuaweiIdAuthExtendedParams should not be null");
        }
        List<Scope> extendedScopes = huaweiIdAuthExtendedParams.getExtendedScopes();
        AuthHuaweiId b11 = x.b();
        if (b11 == null) {
            b11 = new AuthHuaweiId();
        }
        return b11.requestExtraScopes(extendedScopes);
    }

    public static HuaweiIdAuthService getService(Context context, HuaweiIdAuthParams huaweiIdAuthParams) {
        return new HuaweiIdAuthServiceImpl(context, huaweiIdAuthParams, 60900100);
    }

    public static k<AuthHuaweiId> parseAuthResultFromIntent(Intent intent) {
        l lVar = new l();
        HuaweiIdAuthResult a11 = x.a(intent);
        if (a11 == null) {
            lVar.c(new ApiException(new Status(8)));
        } else if (!a11.isSuccess() || a11.getHuaweiId() == null) {
            lVar.c(new ApiException(a11.getStatus()));
        } else {
            lVar.d(a11.getHuaweiId());
        }
        return lVar.b();
    }

    public static HuaweiIdAuthService getService(Activity activity, HuaweiIdAuthParams huaweiIdAuthParams) {
        return new HuaweiIdAuthServiceImpl(activity, huaweiIdAuthParams, 60900100);
    }

    public static boolean containScopes(AuthHuaweiId authHuaweiId, List<Scope> list) {
        if (authHuaweiId == null) {
            return false;
        }
        if (ap.a(list).booleanValue()) {
            return true;
        }
        return authHuaweiId.getAuthorizedScopes().containsAll(list);
    }

    public static void addAuthScopes(Fragment fragment, int i11, HuaweiIdAuthExtendedParams huaweiIdAuthExtendedParams) {
        if (huaweiIdAuthExtendedParams != null) {
            addAuthScopes(fragment, i11, huaweiIdAuthExtendedParams.getExtendedScopes());
            return;
        }
        throw new NullPointerException("HuaweiIdAuthExtendedParams should not be null");
    }

    public static void addAuthScopes(Activity activity, int i11, List<Scope> list) {
        if (activity == null) {
            throw new NullPointerException("Activity should not be null");
        }
        if (list != null) {
            try {
                activity.startActivityForResult(a(activity, list), i11);
                return;
            } catch (Exception e11) {
                as.d("HuaweiIdAuthManager", "Exception：" + e11.getClass().getSimpleName(), true);
                return;
            }
        }
        throw new NullPointerException("ScopeList should not be null");
    }

    public static void addAuthScopes(Fragment fragment, int i11, List<Scope> list) {
        if (fragment == null) {
            throw new NullPointerException("Fragment should not be null");
        }
        if (list != null) {
            try {
                fragment.startActivityForResult(a(fragment.getActivity(), list), i11);
                return;
            } catch (Exception e11) {
                as.d("HuaweiIdAuthManager", "Exception：" + e11.getClass().getSimpleName(), true);
                return;
            }
        }
        throw new NullPointerException("ScopeList should not be null");
    }
}
