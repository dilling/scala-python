import me.shadaj.scalapy.py

object Langchain {
  def run() = {
    val lc_openai = py.module(("langchain_openai"))
    val llm = lc_openai.ChatOpenAI()
    llm.invoke("what is the meaning of life?")
  }
}