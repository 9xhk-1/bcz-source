package com.huawei.hms.support.account;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.hwid.ap;
import com.huawei.hms.hwid.as;
import com.huawei.hms.hwid.f;
import com.huawei.hms.support.account.common.AccountAuthException;
import com.huawei.hms.support.account.request.AccountAuthExtendedParams;
import com.huawei.hms.support.account.request.AccountAuthParams;
import com.huawei.hms.support.account.result.AccountAuthResult;
import com.huawei.hms.support.account.result.AuthAccount;
import com.huawei.hms.support.account.service.AccountAuthService;
import com.huawei.hms.support.account.service.AccountAuthServiceImpl;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.auth.Scope;
import fr.k;
import fr.l;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class AccountAuthManager {
    private static Intent a(Activity activity, List<Scope> list) {
        return getService(activity, f.a(list)).getSignInIntent();
    }

    public static void addAuthScopes(Activity activity, int i11, AccountAuthExtendedParams accountAuthExtendedParams) {
        if (accountAuthExtendedParams == null) {
            throw new NullPointerException("AccountAuthExtendedParams should not be null");
        }
        addAuthScopes(activity, i11, accountAuthExtendedParams.getExtendedScopes());
    }

    public static boolean containScopes(AuthAccount authAccount, AccountAuthExtendedParams accountAuthExtendedParams) {
        if (accountAuthExtendedParams == null) {
            return false;
        }
        return containScopes(authAccount, accountAuthExtendedParams.getExtendedScopes());
    }

    public static AuthAccount getAuthResult() {
        return f.b();
    }

    public static AuthAccount getAuthResultWithScopes(List<Scope> list) throws AccountAuthException {
        if (ap.a(list).booleanValue()) {
            throw new AccountAuthException("ScopeList should not be empty");
        }
        AuthAccount b11 = f.b();
        if (b11 == null) {
            b11 = new AuthAccount();
        }
        b11.requestExtraScopes(list);
        return b11;
    }

    public static AuthAccount getExtendedAuthResult(AccountAuthExtendedParams accountAuthExtendedParams) {
        if (accountAuthExtendedParams == null) {
            throw new NullPointerException("AccountAuthExtendedParams should not be null");
        }
        List<Scope> extendedScopes = accountAuthExtendedParams.getExtendedScopes();
        AuthAccount b11 = f.b();
        if (b11 == null) {
            b11 = new AuthAccount();
        }
        return b11.requestExtraScopes(extendedScopes);
    }

    public static AccountAuthService getService(Context context, AccountAuthParams accountAuthParams) {
        return new AccountAuthServiceImpl(context, accountAuthParams, 60900100);
    }

    public static k<AuthAccount> parseAuthResultFromIntent(Intent intent) {
        l lVar = new l();
        AccountAuthResult a11 = f.a(intent);
        if (a11 == null) {
            lVar.c(new ApiException(new Status(8)));
        } else if (!a11.isSuccess() || a11.getAccount() == null) {
            lVar.c(new ApiException(a11.getStatus()));
        } else {
            lVar.d(a11.getAccount());
        }
        return lVar.b();
    }

    public static AccountAuthService getService(Activity activity, AccountAuthParams accountAuthParams) {
        return new AccountAuthServiceImpl(activity, accountAuthParams, 60900100);
    }

    public static boolean containScopes(AuthAccount authAccount, List<Scope> list) {
        if (authAccount == null) {
            return false;
        }
        if (ap.a(list).booleanValue()) {
            return true;
        }
        return authAccount.getAuthorizedScopes().containsAll(list);
    }

    public static void addAuthScopes(Fragment fragment, int i11, AccountAuthExtendedParams accountAuthExtendedParams) {
        if (accountAuthExtendedParams != null) {
            addAuthScopes(fragment, i11, accountAuthExtendedParams.getExtendedScopes());
            return;
        }
        throw new NullPointerException("AccountAuthExtendedParams should not be null");
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
                as.d("AccountAuthManager", "Exception：" + e11.getClass().getSimpleName(), true);
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
                as.d("AccountAuthManager", "Exception：" + e11.getClass().getSimpleName(), true);
                return;
            }
        }
        throw new NullPointerException("ScopeList should not be null");
    }
}
