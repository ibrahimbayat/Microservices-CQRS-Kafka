void main() {

/*
    Runtime.Version runtimeVersion = Runtime.version();
    String version = String.valueOf(runtimeVersion.version().get(0));
    System.out.println(version);
    System.out.println(sayHello("Qualified"));
    System.out.println(sayHello(""));
    System.out.println(sayHello("    "));
    System.out.println(sayHello(null));

 */
    System.out.println(getTaskIndexAtCycleWithoutArraylist(Arrays.asList(1,1,1,1,1,1),Arrays.asList(1,5,4,4,5,-1),6));
}





public static Integer getTaskIndexAtCycleWithoutArraylist( List<Integer> jobs,List<Integer> dependencies,Integer cycle ) {

    if(jobs.size()==0||cycle<=0){
        return -1;
    }
    //boolean[] done = new boolean[jobs.size()];
    boolean[] done = new boolean [dependencies.size()];
    for(int i =0;i<dependencies.size();i++){
        if(dependencies.get(i)==-1){
            done[i]=(false);
        }
        else{
            done[i]=(true);
        }
    }
    int currentTime=0;
    int willBeExecutedTaskNumber=0;
    while(currentTime<cycle){
        int willBeExecutedTaskCycle=2147483647;
        willBeExecutedTaskNumber=0;
        int taskNumber=0;
        for(Integer taskExecutionTime:jobs){

            if(taskExecutionTime<willBeExecutedTaskCycle&&!done[taskNumber]){
                willBeExecutedTaskNumber=taskNumber;
                willBeExecutedTaskCycle=taskExecutionTime;
            }
            taskNumber++;
        }
        done[willBeExecutedTaskNumber]=true;
        for(int k=0;k<done.length;k++){
            if(dependencies.get(k)==willBeExecutedTaskNumber){
                done[k]=false;
            }
        }
        currentTime=currentTime+willBeExecutedTaskCycle;


    }
    return willBeExecutedTaskNumber;





}












public static Integer getTaskIndexAtCycle( List<Integer> jobs,List<Integer> dependencies,Integer cycle ) {

    if(jobs.size()==0||cycle<=0){
        return -1;
    }
    //boolean[] done = new boolean[jobs.size()];
    ArrayList<Boolean> done = new ArrayList<Boolean>();
    for(int i =0;i<dependencies.size();i++){
        if(dependencies.get(i)==-1){
            done.add(false);
        }
        else{
            done.add(true);
        }
    }
    int currentTime=0;
    int willBeExecutedTaskNumber=0;
    while(currentTime<cycle){
        int willBeExecutedTaskCycle=2147483647;
        willBeExecutedTaskNumber=0;
        int taskNumber=0;
        for(Integer taskExecutionTime:jobs){

            if(taskExecutionTime<willBeExecutedTaskCycle&&!done.get(taskNumber)){
                willBeExecutedTaskNumber=taskNumber;
                willBeExecutedTaskCycle=taskExecutionTime;
            }
            taskNumber++;
        }
        done.set(willBeExecutedTaskNumber,true);
        for(int k=0;k<done.size();k++){
            if(dependencies.get(k)==willBeExecutedTaskNumber){
                done.set(k,false);
            }
        }
        currentTime=currentTime+willBeExecutedTaskCycle;


    }
    return willBeExecutedTaskNumber;





}








public static Integer getTaskIndexAtCycleOld( List<Integer> jobs,Integer cycle ) {
    if(jobs.size()==0||cycle<=0){
        return -1;
    }
    //boolean[] done = new boolean[jobs.size()];
    ArrayList<Boolean> done = new ArrayList<Boolean>();
    for(int i =0;i<jobs.size();i++){
        done.add(false);
    }
    int currentTime=0;
    int willBeExecutedTaskNumber=0;
    while(currentTime<cycle){
        int willBeExecutedTaskCycle=2147483647;
        willBeExecutedTaskNumber=0;
        int taskNumber=0;
        for(Integer taskExecutionTime:jobs){

            if(taskExecutionTime<willBeExecutedTaskCycle&&!done.get(taskNumber)){
                willBeExecutedTaskNumber=taskNumber;
                willBeExecutedTaskCycle=taskExecutionTime;
            }
            taskNumber++;
        }
            done.set(willBeExecutedTaskNumber,true);
            currentTime=currentTime+willBeExecutedTaskCycle;


    }
    return willBeExecutedTaskNumber;

}






















public static String sayHello(String name) {

    if(name==null||name.isEmpty()||name.isBlank()){
        return "Hello there!";
    }
    else{
        return "Hello, "+name+"!";
    }


}