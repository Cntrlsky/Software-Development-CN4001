package SRC.Service;

import SRC.Model.AttendanceRecord;
import SRC.Model.Status;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class AttendanceService {
    public void markAttendance(int teacherId, int sessionId, LocalDate date, Map<Integer, Status> marks) {
        // Implementation for marking attendance
    }
    public boolean isAlreadyMarked(int sessionId, LocalDate date)  
    {
        return false;
    }
    public List<AttendanceRecord> getRecordsForClass(int classId)  
    {
        return new java.util.ArrayList<>();
    }
    public List<AttendanceRecord> getRecordsForStudent(int studentId)  
    {
        return new java.util.ArrayList<>();
    }
}
