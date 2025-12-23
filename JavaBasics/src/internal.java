/*Description:
Create two threads named DataSyncTask (implementing Runnable) and BackupTask (extending Thread). Both tasks should print their progress in loops. Run both tasks concurrently.
Additional Task:
Demonstrate thread synchronization by creating a SharedDataStore class where both threads attempt to update shared data. Ensure controlled access using synchronized blocks or methods.
*/
// task one-Create two threads named DataSyncTask (implementing Runnable) and BackupTask (extending Thread). Both tasks should print their progress in loops. Run both tasks concurrently.
/*
class DataSyncTask implements Runnable{
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.println("Output by Runnable-> "+i);
        }
    }
}
class BackupTask extends Thread{
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("Output by Thread-> "+i);
        }
    }
}
public class internal{
    public static void main(String[] args){
        BackupTask b1=new BackupTask();
        DataSyncTask d1=new DataSyncTask();
        b1.start();
        new Thread(d1).start();
    }
}  */

// task-2(Demonstrate thread synchronization by creating a SharedDataStore class where both threads attempt to update shared data. Ensure controlled access using synchronized blocks or methods.)

   class SharedDataStore {
    private int sharedData = 0;

    public synchronized void incrementData() {
        sharedData++;
    }

    public int getSharedData() {
        return sharedData;
    }
}

class DataSyncTask implements Runnable {
    private SharedDataStore store = new SharedDataStore();

    public DataSyncTask(SharedDataStore store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            store.incrementData();
        }
    }
}

class BackupTask extends Thread {
    private SharedDataStore store = new SharedDataStore();

    public BackupTask(SharedDataStore store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            store.incrementData();
        }
    }
}

public class Internal {
    public static void main(String[] args) throws InterruptedException {
        SharedDataStore store = new SharedDataStore();

        DataSyncTask dataSyncTask = new DataSyncTask(store);
        BackupTask backupTask = new BackupTask(store);
        Thread dataSyncThread = new Thread(dataSyncTask);

        dataSyncThread.start();
        backupTask.start();

        dataSyncThread.join();
        backupTask.join();

        System.out.println("Final value of sharedData: " + store.getSharedData());
    }
}


 