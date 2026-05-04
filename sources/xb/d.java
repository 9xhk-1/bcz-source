package xb;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d {
    public static void a(Cursor c11) {
        if (c11 != null) {
            try {
                c11.close();
            } catch (Exception e11) {
                if (qb.d.b()) {
                    qb.c.d("", "error on close android.database.Cursor.", e11.getMessage());
                }
            }
        }
    }

    public static void b(SQLiteDatabase db2) {
        if (db2 != null) {
            try {
                db2.close();
            } catch (Exception e11) {
                if (qb.d.b()) {
                    qb.c.d("", "error on close android.database.SQLiteDatabase.", e11.getMessage());
                }
            }
        }
    }

    public static void c(Closeable stream) {
        if (stream != null) {
            try {
                stream.close();
            } catch (Throwable th2) {
                if (qb.d.b()) {
                    qb.c.d("", "error on close the Closeable.", th2.getMessage());
                }
            }
        }
    }

    public static void d(InputStream inStream) {
        if (inStream != null) {
            try {
                inStream.close();
            } catch (IOException e11) {
                if (qb.d.b()) {
                    qb.c.d("", "error on close the inputstream.", e11.getMessage());
                }
            }
        }
    }

    public static void e(OutputStream outStream) {
        if (outStream != null) {
            try {
                outStream.close();
            } catch (IOException e11) {
                if (qb.d.b()) {
                    qb.c.d("", "error on close the outputstream.", e11.getMessage());
                }
            }
        }
    }

    public static void f(Reader reader) {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException e11) {
                if (qb.d.b()) {
                    qb.c.d("", "error on close the Reader.", e11.getMessage());
                }
            }
        }
    }

    public static void g(Writer writer) {
        if (writer != null) {
            try {
                writer.close();
            } catch (IOException e11) {
                if (qb.d.b()) {
                    qb.c.d("", "error on close the outputstream.", e11.getMessage());
                }
            }
        }
    }

    public static void h(HttpURLConnection mConn) {
        if (mConn != null) {
            try {
                mConn.disconnect();
            } catch (Exception e11) {
                if (qb.d.b()) {
                    qb.c.d("", "error on close HttpURLConnection.", e11.getMessage());
                }
            }
        }
    }

    public static void i(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e11) {
                if (qb.d.b()) {
                    qb.c.d("", "fail on close socket: " + socket, e11.getMessage());
                }
            }
        }
    }

    public static void j(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (Exception e11) {
                if (qb.d.b()) {
                    qb.c.d("", "error on close java.sql.Connection.", e11.getMessage());
                }
            }
        }
    }

    public static void k(PreparedStatement ps2) {
        if (ps2 != null) {
            try {
                ps2.close();
            } catch (Exception e11) {
                if (qb.d.b()) {
                    qb.c.d("", "error on close java.sql.PreparedStatement.", e11.getMessage());
                }
            }
        }
    }

    public static void l(ResultSet rs2) {
        if (rs2 != null) {
            try {
                rs2.close();
            } catch (Exception e11) {
                if (qb.d.b()) {
                    qb.c.d("", "error on close java.sql.ResultSet.", e11.getMessage());
                }
            }
        }
    }

    public static void m(Statement st2) {
        if (st2 != null) {
            try {
                st2.close();
            } catch (SQLException e11) {
                if (qb.d.b()) {
                    qb.c.d("", "error on close java.sql.Statement.", e11.getMessage());
                }
            }
        }
    }
}
