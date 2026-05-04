package com.baicizhan.main.activity.idenity;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.badlogic.gdx.scenes.scene2d.ui.q;
import com.baicizhan.client.business.webview.args.Arguments;
import com.baicizhan.main.home.plan.module.exam.b;
import m00.c;
import m80.k;
import r60.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class UserIdentity {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ UserIdentity[] $VALUES;

    @k
    private final String desc;
    public static final UserIdentity ALL = new UserIdentity(f.f83306f, 0, TtmlNode.COMBINE_ALL);
    public static final UserIdentity PRIMARY = new UserIdentity("PRIMARY", 1, b.f22502a);
    public static final UserIdentity JUNIOR_HIGH = new UserIdentity("JUNIOR_HIGH", 2, "junior");
    public static final UserIdentity HIGH = new UserIdentity("HIGH", 3, "senior");
    public static final UserIdentity COLLEGE = new UserIdentity("COLLEGE", 4, "college");
    public static final UserIdentity EMPLOYEES = new UserIdentity("EMPLOYEES", 5, "staff");
    public static final UserIdentity STUDENT = new UserIdentity("STUDENT", 6, "student");
    public static final UserIdentity PARENT = new UserIdentity("PARENT", 7, q.a.f13044u);
    public static final UserIdentity OTHERS = new UserIdentity("OTHERS", 8, Arguments.ARG_OTHERS);

    private static final /* synthetic */ UserIdentity[] $values() {
        return new UserIdentity[]{ALL, PRIMARY, JUNIOR_HIGH, HIGH, COLLEGE, EMPLOYEES, STUDENT, PARENT, OTHERS};
    }

    static {
        UserIdentity[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private UserIdentity(String str, int i11, String str2) {
        this.desc = str2;
    }

    @k
    public static m00.a<UserIdentity> getEntries() {
        return $ENTRIES;
    }

    public static UserIdentity valueOf(String str) {
        return (UserIdentity) Enum.valueOf(UserIdentity.class, str);
    }

    public static UserIdentity[] values() {
        return (UserIdentity[]) $VALUES.clone();
    }

    @k
    public final String getDesc() {
        return this.desc;
    }
}
