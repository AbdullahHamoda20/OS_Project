package os_project;

public class Process {
    private int processId;
    private int cpuTime;
    private int priority;
    private int timeQuantum;  // يمكن أن يكون قيمته 0 أو غير موجودة

    private String message;
    private boolean valid;

    public Process(int processId, int cpuTime, int priority, Integer timeQuantum) {
        this.processId = processId;
        this.cpuTime = cpuTime;
        this.priority = priority;

        // إذا كانت القيمة غير موجودة (null)، سيتم تعيينها إلى 0
        this.timeQuantum = (timeQuantum != null) ? timeQuantum : 0;

        this.valid = true;
        this.message = "";

        // تحقق من صلاحية القيم المدخلة
        validate();
    }

    // دالة للتحقق من صلاحية البيانات
    private void validate() {
        if (processId < 1 || processId > 10) {
            message += "Process ID must be between 1 and 10.\n";
            valid = false;
        }

        if (cpuTime <= 0) {
            message += "CPU Time must be greater than 0.\n";
            valid = false;
        }

        if (priority < 0) {
            message += "Priority must be a positive integer.\n";
            valid = false;
        }
    }

    // Getter and Setter methods
    public int getProcessId() {
        return processId;
    }

    public int getCpuTime() {
        return cpuTime;
    }

    public int getPriority() {
        return priority;
    }

    public int getTimeQuantum() {
        return timeQuantum;
    }

    public boolean isValid() {
        return valid;
    }

    public String getMessage() {
        return message;
    }

    void setcpuTime(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}