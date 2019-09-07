package view

import org.uqbar.arena.widgets.*
import org.uqbar.arena.windows.MainWindow
import org.uqbar.arena.kotlin.extensions.*
import org.uqbar.arena.layout.ColumnLayout
import org.uqbar.commons.model.annotations.Observable

fun main() = LoginWindow(AppModel("", "")).startApplication()

@Observable class AppModel(var email: String, var password: String)

class LoginWindow(model: AppModel) : MainWindow<AppModel>(model) {
    override fun createContents(mainPanel: Panel) {
        title = "Digital Wallet - Login"

        val formPanel = Panel(mainPanel)
        formPanel.setLayout(ColumnLayout(2))

        Label(formPanel) with {
            text = "Correo Electrónico"
        }

        TextBox(formPanel) with {
            width = 150
            bindTo("email")
        }

        Label(formPanel) with {
            text = "Contraseña"
        }

        PasswordField(formPanel) with {
            width = 150
            bindTo("password")
        }

        //pendiente: ver como mover al centro o la derecha
        Button(formPanel) with {
            alignCenter()
            width = 100
            text = "Ingresar"
        }
    }
}
