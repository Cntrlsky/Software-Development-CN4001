package SRC.Service;

import SRC.Model.ClassSession;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

public class SessionService {
    public ClassSession createSession(int classId, int teacherId, DayOfWeek day, int period) {
        return null;
    }

    public ClassSession getSession(int sessionId) {
        return null;
    }

    public List<ClassSession> getSessionsForTeacher(int teacherId) {
        return new ArrayList<>();
    }
}
