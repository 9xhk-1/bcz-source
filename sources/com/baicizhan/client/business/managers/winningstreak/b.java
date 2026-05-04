package com.baicizhan.client.business.managers.winningstreak;

import com.baicizhan.online.user_study_api.WinStreakStatus;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final String f16506a = "IWinningStreak";

    /* renamed from: b, reason: collision with root package name */
    public static final int f16507b = 5;

    public static final Date b(int i11) {
        try {
            return new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).parse(String.valueOf(i11));
        } catch (Exception e11) {
            qb.c.c(f16506a, "", e11);
            return new Date(0L);
        }
    }

    public static final int c(long j11) {
        try {
            String format = new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date(j11));
            g0.o(format, "format(...)");
            return Integer.parseInt(format);
        } catch (Exception e11) {
            qb.c.c(f16506a, "", e11);
            return 0;
        }
    }

    @k
    public static final f d(@l WinStreakStatus winStreakStatus) {
        return winStreakStatus != null ? new f(winStreakStatus.getWin_streak_days(), winStreakStatus.getLatest_win_streak_date()) : new f(0, 0);
    }
}
