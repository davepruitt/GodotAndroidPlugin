class_name Main
extends Node2D

@onready var ui_label := $CanvasLayer/VFlowContainer/Label

var plugin

# Called when the node enters the scene tree for the first time.
func _ready() -> void:
	if (Engine.has_singleton("GodotAndroidPlugin")):
		plugin = Engine.get_singleton("GodotAndroidPlugin")
		print_debug("Yay it worked!")
	else:
		if (ui_label):
			ui_label.text = "Cannot find plugin :("
		print_debug("Cannot find plugin!")


# Called every frame. 'delta' is the elapsed time since the previous frame.
func _process(delta: float) -> void:
	pass


func _on_button_pressed() -> void:
	if (plugin):
		print_debug("Yay it worked!")
		plugin.MakeToast()
		var mystr: String = plugin.GetFunAndroidString()
		ui_label.text = mystr
	else:
		ui_label.text = "Cannot find plugin :("
