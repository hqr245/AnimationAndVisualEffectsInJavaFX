module es.ieslosmontecillos.animationandvisualeffectsinjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.animationandvisualeffectsinjavafx to javafx.fxml;
    exports es.ieslosmontecillos.animationandvisualeffectsinjavafx;
}