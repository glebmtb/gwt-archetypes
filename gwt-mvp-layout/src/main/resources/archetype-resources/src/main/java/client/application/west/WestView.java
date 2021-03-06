#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.application.west;

import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.IsWidget;

public interface WestView extends IsWidget {
    void setPresenter(Presenter presenter);

    HasText getValue();

    public interface Presenter {

    }
}
