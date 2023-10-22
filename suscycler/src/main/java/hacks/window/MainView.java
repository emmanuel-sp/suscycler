package hacks.window;
import com.vaadin.flow.router.OptionalParameter;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.component.button.Button;
import hacks.repository.*;
import hacks.model.*;
@Route("Info")
public class MainView extends VerticalLayout implements HasUrlParameter<String> {
    public TextField enterName;
    public Button button;
    public MainView(BinRepository binRepository) {

    }

    @Override
    public void setParameter(BeforeEvent event, @OptionalParameter String parameter) {
    

    }
}