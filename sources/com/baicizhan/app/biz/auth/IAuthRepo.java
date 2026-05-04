package com.baicizhan.app.biz.auth;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface IAuthRepo {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class KickOffException extends RuntimeException {
    }

    @m80.l
    Object a(@m80.k j00.c<? super Boolean> cVar) throws KickOffException, CancellationException;
}
