public interface Subject {
    public void subscribe(Observer obs);
    public void unsubscribe(Observer obs);
    public void notifyVideo(String videoTitle);
    public void uploadVideo(String message);
}
