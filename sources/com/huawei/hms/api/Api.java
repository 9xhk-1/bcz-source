package com.huawei.hms.api;

import com.huawei.hms.api.Api.ApiOptions;
import com.huawei.hms.common.api.ConnectionPostProcessor;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class Api<O extends ApiOptions> {
    private final String mApiName;
    public List<ConnectionPostProcessor> mConnetctPostList;
    private final Options<O> mOption;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface ApiOptions {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public interface HasOptions extends ApiOptions {
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class NoOptions implements NotRequiredOptions {
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public interface NotRequiredOptions extends ApiOptions {
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public interface Optional extends HasOptions, NotRequiredOptions {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class Options<O> {
        public List<PermissionInfo> getPermissionInfoList(O o11) {
            return Collections.EMPTY_LIST;
        }

        public List<Scope> getScopeList(O o11) {
            return Collections.EMPTY_LIST;
        }
    }

    public Api(String str) {
        this.mApiName = str;
        this.mOption = null;
    }

    public String getApiName() {
        return this.mApiName;
    }

    public Options<O> getOptions() {
        return this.mOption;
    }

    public List<ConnectionPostProcessor> getmConnetctPostList() {
        return this.mConnetctPostList;
    }

    public void setmConnetctPostList(List<ConnectionPostProcessor> list) {
        this.mConnetctPostList = list;
    }

    public Api(String str, Options<O> options) {
        this.mApiName = str;
        this.mOption = options;
    }
}
